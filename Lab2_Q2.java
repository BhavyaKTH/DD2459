/*Sorting
  @ requires A!=null;
  @ ensures \forall int j; 0 <= j < A.length; 
            \num_of int i; 0 <= i < A.length; A[i] == \old(A)[j];
            \num_of int i; 0 <= i < A.length; \old(A)[i] = \old(A)[j]
  @*/

/*Searching
  @ requires A!=null;
  @ ensures \result >= 0 ==> 0 <=\result < \old(A).length & \old(A)[\result] == key;
            && \result == -1 ==> !\exists(int j; 0 < \old(A).length; \old(A)[j] == key) 
            && \result >= -1
  @*/

/*Membership
  @ requires A!=null;
  @ ensures \result >= 0 ==> 0 <=\result < \old(A).length & \old(A)[\result] == key;
            && \result == -1 ==> !\exists(int j; 0 < \old(A).length; \old(A)[j] == key) 
            && \result == 0 | result == 1;
  @*/

/*Binary searching
  @ requires A!=null & \forall (int i; 0 <= i  < A.length -1; A[i] <= A[i+1]);
  @ ensures \result >= 0 ==> 0 <=\result < \old(A).length & \old(A)[\result] == key;
            && \result == -1 ==> !\exists(int j; 0 < \old(A).length; \old(A)[j] == key) 
            && \result == 0 | result == 1;
  @*/