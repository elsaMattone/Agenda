package agenda;

import java.time.*;

public class Event {

    /**
     * The myTitle of this event
     */
    private String myTitle;
    
    /**
     * The starting time of the event
     */
    private LocalDateTime myStart;

    /**
     * The durarion of the event 
     */
    private Duration myDuration;


    /**
     * Constructs an event
     *
     * @param title the title of this event
     * @param start the start time of this event
     * @param duration the duration of this event
     */
    public Event(String title, LocalDateTime start, Duration duration) {
        this.myTitle = title;
        this.myStart = start;
        this.myDuration = duration;
    }

    /**
     * Tests if an event occurs on a given day
     *
     * @param aDay the day to test
     * @return true if the event occurs on that day, false otherwise
     */
    public boolean isInDay(LocalDate aDay) {
        boolean isInDay = false;
        LocalDateTime end = myStart.plus(myDuration);        
        if((myStart.toLocalDate().compareTo(aDay)==0) || ((myStart.toLocalDate().compareTo(aDay)<0) && (end.toLocalDate().compareTo(aDay)>0)) || (end.toLocalDate().compareTo(aDay)==0)){
<<<<<<< HEAD
=======

>>>>>>> 3ef0bd6d952b3815b592b63fc61e817cd3846a2b
            isInDay = true;
        }
        return isInDay;
    }
   
    /**
     * @return the myTitle
     */
    public String getTitle() {
        return myTitle;
    }

    /**
     * @return the myStart
     */
    public LocalDateTime getStart() {
        return myStart;
    }


    /**
     * @return the myDuration
     */
    public Duration getDuration() {
        return myDuration;
    }

    @Override
    public String toString() {
        return "Event{" + "myTitle=" + myTitle + ", myStart=" + myStart + ", myDuration=" + myDuration + '}';
    }

    
   
    
}
