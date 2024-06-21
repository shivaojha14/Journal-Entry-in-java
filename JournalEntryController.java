package com.example.journalApp.controller;

import com.example.journalApp.entity.JournalENTRY;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long,JournalENTRY>JournalEntites=new HashMap<>();
    @GetMapping
    public List<JournalENTRY> getall(){

return  new ArrayList<>(JournalEntites.values());
    }
@PostMapping
public boolean createEntry(@RequestBody JournalENTRY myEntry)
{
JournalEntites.put(myEntry.getId(),myEntry);
return true;
}
@GetMapping("id/{myid}")
public JournalENTRY getjournalentryByid(@PathVariable Long myid){
        return JournalEntites.get(myid);

    }
    @DeleteMapping("id/{myid}")
    public JournalENTRY deletejournalentryByid(@PathVariable Long myid) {
        return JournalEntites.remove(myid);
    }
@PutMapping("/id/{id}")
public JournalENTRY updatejournalentryByid(@PathVariable Long id,@RequestBody JournalENTRY myEntry)
{
    return JournalEntites.put(id,myEntry);
}

}
