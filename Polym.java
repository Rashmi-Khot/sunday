class Vedio{
 public void search(){
 System.out.println("some vedio");
 }
}

class Study extends Vedio{
 public void search(){
  System.out.println("study pattern");
 }
}

class Movie extends Vedio{
public void search(){
System.out.println("watch movie");
}
}

class Youtube{
static void play(Vedio v){
v.search();

}
}

class Polym{
public static void main(String[] args){
 Study s=new Study();
 Movie m=new Movie();
 Youtube.play(s);
 Youtube.play(m);
}
}