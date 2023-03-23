import java.util.Arrays;

public class missing_element_arr_Q6 {

	public static void main(String[] args) {
		int size =8;
		int arr[] = {2,5,3,7,9,1,8,6};
		Arrays.sort(arr);
		boolean check=false;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==i+1) {
				check=true;
			}
			if(check==false) {
				System.out.println(i);
				
			}
		}

	}

}
