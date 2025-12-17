package com.example.demo.newserviceimpl;

@Service
public class newserviceimpl implements NewfileService{
    private final NewfileRepo rep;

    public NewfileServiceImpl(NewfileRepo rep){
        this.rep=rep;

    }

    @Override
    public NewfileEntity savedata(NewfileEntity newfile){
        return rep.save(newfile);//post

    }
     @Override
    public NewfileEntity getidval(Long id){
        return rep.findById(id);//specific id

    }
     @Override
    public List<NewfileEntity> getall(){
        return rep.findAll();//all id

    }
     @Override
    public NewfileEntity update(Long id, NewfileEntity newfile){
        return rep.replace(id,newfile);//retrive id from newfile and update

    }    
     @Override
    public void delete(Long id){
        return rep.remove(id);//remove the column id
    }


    
    
}