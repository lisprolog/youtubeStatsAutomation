import java.util.Scanner;
import java.util.Objects;
import java.util.PriorityQueue;

class Video implements Comparable<Video> {
    private String name;
    private double views;

    public Video(String name, double views) {
        this.name = name;
        this.views = views;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getViews() {
        return views;
    }

    public void setViews(double views) {
        this.views = views;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Double.compare(video.views, views) == 0 &&
                Objects.equals(name, video.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, views);
    }
/*
    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", views=" + views +
                '}';
    }
*/    
    @Override
    public String toString() {
        String result = "";
        if (views < 10){
            result += "  ";
        }else if(views < 100){
            result += " ";
        }    
        return result += (int)views + "=" + name;
    }    

    // Compare two video objects by their views
    @Override
    public int compareTo(Video video) {
        if(this.getViews() > video.getViews()) {
            return -1;
        } else if (this.getViews() < video.getViews()) {
            return 1;
        } else {
            return 0;
        }
    }
}


public class TopTenPriority {
    public static void main(String[] args) {
        /*
           The requirement for a PriorityQueue of user defined objects is that

           1. Either the class should implement the Comparable interface and provide
              the implementation for the compareTo() function.
           2. Or you should provide a custom Comparator while creating the PriorityQueue.
        */

        // Create a PriorityQueue
        PriorityQueue<Video> videoPriorityQueue = new PriorityQueue<>();
        
        Scanner sc = new Scanner(System.in);	
        

        String name = "";
        String buffer = "";
        double views = 0;
        
        while(sc.hasNextLine()){
            name = sc.nextLine();
            buffer = sc.nextLine();
            if(buffer.equals("No")){
                views = 0;
            }else{
                views = Integer.valueOf(buffer);
            }
            videoPriorityQueue.add(new Video(name, views));
        }
        while (!videoPriorityQueue.isEmpty()) {
            System.out.println(videoPriorityQueue.remove());
        }
        sc.close();        
        
        /*
            The compareTo() method implemented in the Video class is used to determine
            in what order the objects should be dequeued.
        */
    }
}
