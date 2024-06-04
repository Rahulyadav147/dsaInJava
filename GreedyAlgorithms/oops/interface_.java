package oops;

public class interface_ {
    public static void main(String[] args){
     king k=new king();
     k.moves();
    }
}

interface chessPlayer{
    void moves();//  no implementation is given
}

class king implements chessPlayer{
     public void moves(){//void is bydefault public in interface(cannot reduce visibiliy)
        System.out.println("lef,right,up,down");
    }
}

class queen implements chessPlayer{
    public void moves(){
        System.out.println("left ,right,up,down,diagnals n steps");
    }
}