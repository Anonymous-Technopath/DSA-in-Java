/*
*Solution By : Nimish Shandilya
*LinkedIn : https://www.linkedin.com/in/nimish-shandilya-0a429b22b
*
*Problem : Floor in a Sorted Array
*Problem Source : Geeks for Geeks
*Problem Link : https://practice.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/
* 
*/

class Floor_in_a_Sorted_Array{
    
    // Function to find floor of x
    // arr: input array
    // n is the size of array
    static int findFloor(long arr[], int n, long key)
    {
        if(n==0){
            return -1;
        }
        if(arr[0]>key){
            return -1;
        }
        int first=0;
        int last=n-1;
         int mid = (first + last)/2;  
   while( first <= last ){  
      if ( arr[mid] < key ){  
        first = mid + 1;     
      }else if ( arr[mid] == key ){  
        break;  
      }else{  
         last = mid - 1;  
      }  
      mid = (first + last)/2;  
   }  
   if(arr[mid]==key){
       return mid;
   }
   else if(arr[mid]>key){
       while(mid>=0){
           mid--;
           if(arr[mid]<key)
           return mid;
       }
    }
    else{
        return mid;
    }
    return -1;
    }
}
