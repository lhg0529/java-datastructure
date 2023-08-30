package list;

public class ArrList<E> {
  //인스턴스 변수
  public E a[]; //private E[] a;
  private int size;
  //생성자
  public ArrList(){
    a = (E[]) new Object[1];
    size = 0;
  }
  //연산 메서드
  public int size(){
    return size;
  }

  public E get(int k){
    if(size==0)
      throw new IndexOutOfBoundsException();
    return a[k];
  }

  //public boolean add(E e){

  //}
}
