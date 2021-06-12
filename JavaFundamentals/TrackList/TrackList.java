import java.util.HashMap;
public class TrackList{
    public static HashMap<String, String> createHashMap(){
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("falling","a ltrics for falling song");
        trackList.put("tamalyMa3ak","eh ya 7abebe mshta2lak");
        trackList.put("3ayemFBa7r el 8adr","shat el nadala mlyan");
        trackList.put("ardElWada3","2olo lle ba3, melyon wada3");
        return trackList;
    }
    public static void main(String[] args){
        HashMap<String, String> myHashMap = createHashMap();
        System.out.println(myHashMap.get("ardElWada3"));

        for(String song : myHashMap.keySet()){
            System.out.println(song + " : "+ myHashMap.get(song));
        }
    }
}