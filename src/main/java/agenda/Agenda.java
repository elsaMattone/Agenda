package agenda;

import java.time.*;
import java.util.*;

/**
 * Description : An agenda that stores events
 */
public class Agenda {

    private List<Event> events = new ArrayList<Event>();
    Event e, event;

    /**
     * Adds an event to this agenda
     *
     * @param e the event to add
     */
    public void addEvent(Event e) {
        events.add(e);
    }

    /**
     * Computes the events that occur on a given day
     *
     * @param day the day toi test
     * @return and iteraror to the events that occur on that day
     */
    public List<Event> eventsInDay(LocalDate day) {
        List<Event> eventsInDay = new ArrayList<Event>();
        for (Event e : events){
            if (e.isInDay(day) == true) {
                eventsInDay.add(e);
            }
        }
        return eventsInDay;
    }
    
    /**
     * Trouver les événements de l'agenda en fonction de leur titre
     *
     * @param title le titre à rechercher
     * @return les événements qui ont le même titre
     */
    public List<Event> findByTitle(String title) {
        ArrayList<Event> titresTrouvés = new ArrayList<Event>();
        for (Event e : events){
            if (e.getTitle().equals(title)){
                titresTrouvés.add(e);
            }
        }
        return titresTrouvés;
    }
    
    /**
     * Déterminer s’il y a de la place dans l'agenda pour un événement
     *
     * @param e L'événement à tester (on se limitera aux événements simples)
     * @return vrai s’il y a de la place dans l'agenda pour cet événement
     */
    public boolean isFreeFor(Event e) {
        boolean disponible = true;
        for (Event event : events){
            if (((e.getStart().isAfter(event.getStart())) || ((e.getStart().isEqual(event.getStart())))) && ((e.getStart().isBefore(event.getStart().plus(event.getDuration()))) || (e.getStart().isEqual(event.getStart().plus(event.getDuration()))))) {
                disponible = false;
            }
        }
        return disponible;
    }
}
