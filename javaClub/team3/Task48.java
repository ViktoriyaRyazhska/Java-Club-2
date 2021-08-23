package javaClub.team3;

import java.util.Arrays;

public class Task48{
	
	public int[] arr;
	final static Task48 IDENTITY = new Task48(new int [] {1, 2, 3, 4});
	final static Task48 ROTATE_90_ANTICLOCKWISE = new Task48(new int [] {2, 4, 1, 3});
	final static Task48 ROTATE_180 = new Task48(new int [] {4, 3, 2, 1});
	final static Task48 ROTATE_90_CLOCKWISE = new Task48(new int [] {3, 1, 4, 2});
	final static Task48 REFLECT_VERTICAL = new Task48(new int [] {2, 1, 4, 3});
	final static Task48 REFLECT_FORWARD_DIAGONAL = new Task48(new int [] {4, 2, 3, 1});
	final static Task48 REFLECT_HORIZONTAL = new Task48(new int [] {3, 4, 1, 2});
	final static Task48 REFLECT_REVERSE_DIAGONAL = new Task48(new int [] {1, 3, 2, 4});
	
	
	public Task48() {
		
	}
	
	public Task48(int[] arr) {
		this.arr = arr;
	}
	
	Task48 inv(){
		
		if (this.equals(ROTATE_90_ANTICLOCKWISE)) return ROTATE_90_CLOCKWISE;
		if (this.equals(ROTATE_90_CLOCKWISE)) return ROTATE_90_ANTICLOCKWISE;
		
		return this; 
	}
	Task48 getObjByArr(int[] arr) {
		
		if (Arrays.equals(arr, new int [] {1, 2, 3, 4})) return IDENTITY;
		if (Arrays.equals(arr, new int [] {2, 4, 1, 3})) return ROTATE_90_ANTICLOCKWISE;
		if (Arrays.equals(arr, new int [] {4, 3, 2, 1})) return ROTATE_180;
		if (Arrays.equals(arr, new int [] {3, 1, 4, 2})) return ROTATE_90_CLOCKWISE;
		if (Arrays.equals(arr, new int [] {2, 1, 4, 3})) return REFLECT_VERTICAL;
		if (Arrays.equals(arr, new int [] {4, 2, 3, 1})) return REFLECT_FORWARD_DIAGONAL;
		if (Arrays.equals(arr, new int [] {3, 4, 1, 2})) return REFLECT_HORIZONTAL;
		if (Arrays.equals(arr, new int [] {1, 3, 2, 4})) return REFLECT_REVERSE_DIAGONAL;
		
		return null;
		
	}
	
	Task48 then(Task48 r){
		if (r.equals(IDENTITY)) return this;
		if (this.equals(IDENTITY)) return r;
		
		if (r.equals(ROTATE_90_ANTICLOCKWISE)) return getObjByArr(new int[] {this.arr[1], this.arr[3], this.arr[0], this.arr[2]});
		if (r.equals(ROTATE_180)) return getObjByArr(new int[] {this.arr[3], this.arr[2], this.arr[1], this.arr[0]});
		if (r.equals(ROTATE_90_CLOCKWISE)) return getObjByArr(new int[] {this.arr[2], this.arr[0], this.arr[3], this.arr[1]});
		if (r.equals(REFLECT_VERTICAL)) return getObjByArr(new int[] {this.arr[1], this.arr[0], this.arr[3], this.arr[2]});
		if (r.equals(REFLECT_FORWARD_DIAGONAL)) return getObjByArr(new int[] {this.arr[3], this.arr[1], this.arr[2], this.arr[0]});
		if (r.equals(REFLECT_HORIZONTAL)) return getObjByArr(new int[] {this.arr[2], this.arr[3], this.arr[0], this.arr[1]});
		if (r.equals(REFLECT_REVERSE_DIAGONAL)) return getObjByArr(new int[] {this.arr[0], this.arr[2], this.arr[1], this.arr[3]});
		
		return null; 
	}
	

	 boolean is_rotation(){		
		return this.equals(ROTATE_180) || this.equals(ROTATE_90_ANTICLOCKWISE)||
			this.equals(ROTATE_90_CLOCKWISE) || this.equals(IDENTITY); 
	}
	 
	 boolean is_reflection(){		
			return this.equals(REFLECT_VERTICAL) || this.equals(REFLECT_FORWARD_DIAGONAL)||
				this.equals(REFLECT_HORIZONTAL) || this.equals(REFLECT_REVERSE_DIAGONAL); 
		}
	
	 public static String toString(Task48 r)
	 {
	   return r.equals(IDENTITY)                 ? "identity transformation"
	        : r.equals(ROTATE_90_ANTICLOCKWISE)  ? "rotation 90 degrees anticlockwise"
	        : r.equals(ROTATE_180)               ? "rotation 180 degrees"
	        : r.equals(ROTATE_90_CLOCKWISE)      ? "rotation 90 degrees clockwise"
	        : r.equals(REFLECT_VERTICAL)         ? "reflection in vertical line"
	        : r.equals(REFLECT_FORWARD_DIAGONAL) ? "reflection in forward-diagonal line"
	        : r.equals(REFLECT_HORIZONTAL)       ? "reflection in horizontal line"
	        : r.equals(REFLECT_REVERSE_DIAGONAL) ? "reflection in reverse-diagonal line"
	        :                                      "unknown Task48 value";
	 }

}
