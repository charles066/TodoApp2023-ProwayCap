
package model;

/**
 *
 * @author leona
 */
public class Tag {
    
    private int idProject;
    private int idTask;
    private int id;

      public Tag(int idProject, int idTask, int id, String tag) {
       this.idProject = idProject;
       this.idTask = idTask;
        this.id = id;
        this.tag = tag;
    } 
    
     
    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public int getIdTask() {
        return idTask;
    }

    public void setIdTask(int idTask) {
        this.idTask = idTask;
    }
    private String tag;
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Override
    public String toString() {
        return this.tag;
    }

       
    
    
    
    
    
    
    
    
    
    
}
