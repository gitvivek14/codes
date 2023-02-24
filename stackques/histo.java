import java.util.Stack;
public class histo {
    public static int maxarea(int arr[]){
        int nsl[]= new int[arr.length];
        int nsr[] = new int[arr.length];
        Stack<Integer> s1 = new Stack<>();
        for(int i = arr.length-1;i>=0;i--){
            while(!s1.isEmpty() && arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nsr[i]=arr.length;
            }else{
                nsr[i]=s1.peek();
            }
            s1.push(i);
        }
        s1 = new Stack<>();
        for(int i = 0;i<arr.length;i++){
            while(!s1.isEmpty()&& arr[s1.peek()]>=arr[i]){
                s1.pop();
            }
            if(s1.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s1.peek();
            }
            s1.push(i);
        }
        int maxarea = 0;
        //calc area
        for(int i =0;i<arr.length;i++){
            int width = nsr[i]-nsl[i]-1;
            int height = arr[i];
            int area = width*height;
            maxarea = Math.max(maxarea, area);
        }

        return maxarea;

    }
    public static void main(String[] args) {
        int arr[]={2,1,5,6,2,3};
        System.out.println(maxarea(arr));
        
    }
    

}
