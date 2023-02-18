package com.projek.service;

import com.projek.model.Inventaris;
import com.projek.repository.IInventarisRepo;

import java.util.List;
import java.util.Optional;

public class InventarisImplemen implements IInventaris {

//    private List<Inventaris> objeks;
    private IInventarisRepo inventarisrepo;

    public InventarisImplemen(IInventarisRepo inventarisrepo) {
        this.inventarisrepo = inventarisrepo;
        System.out.println("Counter repository object Id: " + this.inventarisrepo.hashCode());
    }

//    public InventarisImplemen() {
////        objeks = new ArrayList<>();
//    }

    @Override
    public List<Inventaris> lists() {
  //      return objeks;
        try {
            return inventarisrepo.getAllData();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


    @Override
    public Inventaris insert(Inventaris inv) {
   //    objeks.add(inv);
    //   return inv;
        try {
            return inventarisrepo.insertData(inv);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Inventaris data, String id) {

        try {
            inventarisrepo.updateData(data, id);
        }
        catch (Exception e){
            throw new RuntimeException();
        }
    }

    @Override
    public void delete(String id) {
        try{
            inventarisrepo.deleteBy(id);
        }
        catch (Exception e) {
            throw new RuntimeException();
        }
    }

    //opsional default return empty
    @Override
    public Optional<Inventaris> get(String id) {
       return Optional.empty();
    }
}
