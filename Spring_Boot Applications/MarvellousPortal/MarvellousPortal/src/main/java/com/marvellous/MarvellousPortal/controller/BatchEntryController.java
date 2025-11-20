package com.marvellous.MarvellousPortal.controller;

import com.marvellous.MarvellousPortal.Entity.BatchEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/batches")
public class BatchEntryController
{
    private Map<Long, BatchEntry> batchentries = new HashMap<>();

    // HTTP : GET
    // R : Read
    // select * from batches;
    @GetMapping
    public List<BatchEntry> getAll()
    {
        return  new ArrayList<>(batchentries.values());
    }

    // HTTP : POST
    // C : Create
    // insert into batches values(1,"PPA",25000)
    @PostMapping
    public String creteEntry(@RequestBody BatchEntry myentry)
    {
        batchentries.put(myentry.getId(), myentry);
        return "Record inserted successfully";
    }

    // HTTP : GET
    // R : Read
    // select * from batches where id = 1;
    @GetMapping("/id/{myid}")
    public BatchEntry getBatchEntryById(@PathVariable Long myid)
    {
        return batchentries.get(myid);
    }

    // HTTP : Delete
    // D : Delete
    // delete from batches where id = 1 ;
    @DeleteMapping("/id/{myid}")
    public BatchEntry deleteEntryById(@PathVariable Long myid)
    {
        return batchentries.remove(myid);
    }

    // HTTP : PUT
    // update batches set fees = 30000 where id = 1
    @PutMapping("/id/{myid}")
    public BatchEntry updateEntryById(@PathVariable Long myid, BatchEntry myentry)
    {
        batchentries.put(myentry.getId(), myentry);
        return batchentries.put(myid,myentry);
    }
}
