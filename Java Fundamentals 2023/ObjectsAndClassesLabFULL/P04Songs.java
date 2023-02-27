package ObjectsAndClassesLabFULL;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] inputSongArr = input.split("_");

            Song currentSong = new Song(inputSongArr[0], inputSongArr[1], inputSongArr[2]);
            songList.add(currentSong);
        }

        String finalInput = scanner.nextLine();

        if (finalInput.equals("all")) {
            for (Song song : songList) {
                System.out.printf("%s%n", song.getName());
            }
        } else {
            for (Song song : songList) {
                if (finalInput.equals(song.getTypeList())) {
                    System.out.printf("%s%n", song.getName());
                }
            }

        }


    }
}
