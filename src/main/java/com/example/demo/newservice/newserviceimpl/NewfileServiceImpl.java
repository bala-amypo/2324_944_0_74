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
        return rep.get(id);

    }
     @Override
    public List<NewfileEntity> getall(){
        return rep.getall();

    }
     @Override
    public NewfileEntity update(Long id, NewfileEntity newfile){
        return rep.replace(id,newfile);

    }    
    
    
}