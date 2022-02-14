package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.attribute.standard.Severity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

    @GetMapping
    public String displayAllEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        return "events/index";
    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
    // Let’s make our events list a HashMap! This enables us to add descriptions to our events.
    // Fill your events HashMap with the names and descriptions of 3 coding events around town.
//        model.addAttribute("title", "Create Event");
        HashMap<String, String> events = new HashMap<>();
        events.put("Hour of Code", "Take and hour to code and learn.");
        events.put("Strange Loop", "Learn to code a variety of loops.");
        events.put("CES", "Come and mingle.");
    model.addAttribute("events", events);
        return "events/create";
    }

//    @PostMapping("create")
//    public String processCreateEventForm(@RequestParam String eventName) {
//        events.add(eventName);
//        return "redirect:";
//    }

}
