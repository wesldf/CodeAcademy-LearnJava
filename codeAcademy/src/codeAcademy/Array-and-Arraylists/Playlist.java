package codeAcademy;
import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {

    ArrayList<String> desertIslandPlaylist = new ArrayList <String>();

    desertIslandPlaylist.add("Enter Sandman");
    desertIslandPlaylist.add( "Nothing Else Matters");
    desertIslandPlaylist.add("Unforgiven I");
    desertIslandPlaylist.add("Unforgiven III");
    desertIslandPlaylist.add("Wasted Years ");
    desertIslandPlaylist.add("Flight of Icarus");
    
   System.out.println(desertIslandPlaylist);
   System.out.println(desertIslandPlaylist.size());

   desertIslandPlaylist.remove("Flight of Icarus");

   System.out.println(desertIslandPlaylist);

   String a =  desertIslandPlaylist.get(0);
   String b = desertIslandPlaylist.get(1);
   desertIslandPlaylist.set(0,b);
   desertIslandPlaylist.set(1,a);
    System.out.println(desertIslandPlaylist);

  }
}