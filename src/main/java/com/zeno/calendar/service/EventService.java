package com.zeno.calendar.service;

import com.zeno.calendar.pojo.Event;

import java.util.List;

public interface EventService {
    /**
     * save a event
     * @param event
     */
    void insertEvent(Event event);

    /**
     * get events
     * @param email
     * @return
     */
    List<Event> getEvent(String email);

    /**
     *
     * @param id
     * @return
     */
    void deleteEvent(String id);

    /**
     *
     * @param id
     * @return
     */
    List<Event> getDetailsOfEvent(String id);

    /**
     *
     * @param id
     * @return
     */
    boolean updateEventTime(String id);

    /**
     *
     * @param event
     * @return
     */
    boolean editEvent(Event event);
}
