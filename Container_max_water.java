
public class Container_max_water {

	public static void main(String[] args) {

		Container_max_water obj  = new Container_max_water();
		int arr[] = {1,8,6,2,5,4,8,3,7};
		System.out.println(obj.MaxArea(arr));
	}

	public int MaxArea(int height[]) {
	int maxArea=0;
	int left =0;
	int right =height.length-1;
	
	while(left<right) {//traverse using two pointer
		int width = right -left ;
//using smaller of the 2 heights to calculate area because we always consider the smaller ht,hence min
		int area =Math.min(height[left], height[right])*width;
		maxArea=Math.max(area,maxArea);
//we always leave the smaller height and consider larger ht as it gives us the max area 
		if(height[left]<height[right]) {
		left ++;
		}
		else right --;
		}
		return maxArea;}
}//done
/* You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).*/
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
//Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.