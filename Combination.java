//Student name: Zachary Flahaut
//Student number: 30056316
//Course code: ITI1121
//Lab section: Z-01

public class Combination implements Comparable<Combination>{

    private int first;
    private int second;
    private int third;

    public Combination( int first, int second, int third ) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean equals( Object obj ) {
        Combination other = (Combination) obj;
        return ( ( other != null ) &&
                 ( first == other.first ) &&
                 ( second == other.second ) &&
                 ( third == other.third ) );
    }
    public int compareTo(Combination other){

      int something = 0;

      if(first < other.first){
        something = -1;
      }
      else if(first > other.first){
        something = 1;
      }
      else if(second < other.second){
        something = -1;
      }
      else if(second > other.second){
        something = 1;
      }
      else if(third < other.third){
        something = -1;
      }
      else if(third > other.third){
        something = 1;
      }
      return something;
    }

    public String toString() {
        return first + ":" + second + ":" + third;
    }

}
