class Solution {
	public int[] arrayRankTransform(int[] arr) {
	HashMap < Integer, Integer > mp = new HashMap < Integer, Integer > ();
    int temp = 1;
    int n = arr.length;
    
    int brr[] = new int[n];
    //Copying elememts from arr to brr
    for (int i = 0; i < n; i++) {
      brr[i] = arr[i];
    }
    Arrays.sort(brr);
        
    for (int i = 0; i < n; i++) {
      //if element is previously not store in the map
      if (mp.get(brr[i]) == null) {
        mp.put(brr[i], temp);
        temp++;
      }
    }
    
    for (int i = 0; i < n; i++) {
      brr[i]= mp.get(arr[i]);
      }
        
    return brr;
    }
        
    
}