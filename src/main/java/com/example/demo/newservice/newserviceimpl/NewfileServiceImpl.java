package com.example.demo.newserviceimpl;

@Service
public class newserviceimpl implements NewfileService{
    private final NewfileRepo rep;

    public NewfileServiceImpl(NewfileRepo rep){
        this.rep=rep;

    }

    @Override
    public NewfileEntity savedata(NewfileEntity newfile){
        return rep.save(newfile);

    }
     @Override
    public NewfileEntity getidval(Long id){

    }
     @Override
    public List<NewfileEntity> getall(){

    }
     @Override
    public NewfileEntity update(Long id, NewfileEntity newfile){

    }    
    
    
}