public class Main {

    public static void main(String[] args) {
	Artist ArianaGrande = new Artist("Ariana","Grande","female");
	Artist edSheeran = new Artist("Ed","Sheeran","male");
	Song noTearsLeftToCry = new Song("No Tears Left To Cry",ArianaGrande,4);
	Song sevenrings = new Song("7 rings",ArianaGrande,3);
	Song perfect = new Song("Perfect",edSheeran,4.23);
	Playlist playlist = new Playlist();
	playlist.addSong(noTearsLeftToCry);
	playlist.addSong(sevenrings);
	playlist.addSong(perfect);
	playlist.listSong();


    }
}
class Artist{
    private String name;
    private String surname;
    private String gender;
    public Artist(String name ,String surname ,String gender){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString(){
        return this.name + " " + this.surname;
    }
}
class Song{
    private String title;
    private Artist artist;
    private double duration;

    public Song(String title, Artist artist, double duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Artist getArtist() {
        return artist;
    }
    public void setArtist(Artist artist) {
        this.artist = artist;
    }
    public double getDuration() {
        return duration;
    }
    public void setDuration(double duration) {
        this.duration = duration;
    }
    public String toString(){
        return  this.artist+"\t -"+this.title +"\t -"+ this.duration + " minutes";
    }

}
class Playlist{
    private Song[] songList;
    public Playlist(){
       songList = new Song[20];
    }
    public Song[] getSongList() {
        return songList;
    }
    public void listSong(){
        for (int j = 0;j<songList.length;j++){
            if(songList[j]!= null)
                System.out.println(songList[j]);
        }
    }
    public void addSong(Song song){
        for (int i = 0;i< songList.length;i++){
            if (songList[i]==null){
                songList[i] = song;
                break;
            }
        }
    }
}
