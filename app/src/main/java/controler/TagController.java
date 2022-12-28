
package controler;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Tag;
import util.ConnectionFactory;

/**
 *
 * @author leona
 */
public class TagController {
    
     public void save(Tag tag) {
        String sql = "INSERT INTO tag ("
                + "idProject,"
                + "idTask,"
                + "tag,"
                + " VALUES(?, ?, ?, )";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, tag.getIdProject());
            statement.setInt(2, tag.getIdTask());
            statement.setString(3, tag.getTag());
            
                        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar a tag " + ex.getMessage(), ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
     
     public void update(Tag tag) throws SQLException {
        
        String sql = "UPDATE tag SET" 
                + "idProject = ?,"
                + "idTask = ?,"
                + "tag = ?,"
                + "WHERE id = ?";
                
        
        Connection connection = null;
        PreparedStatement statement = null;
        statement = connection.prepareStatement(sql);
        statement.setInt(1, tag.getIdProject());
        statement.setInt(2, tag.getIdTask());
        statement.setString(3, tag.getTag());
        statement.setInt(4, tag.getId());
        
        try {
            //Estabelecendo a conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
           
            
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao atualizar a tag", ex);
            
        }
    }

     public void removeById(int tagId) throws SQLException {
        String sql = "DELETE FROM tag WHERE id  = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try { 
            //Criação da conexão com o banco de dados
            connection = ConnectionFactory.getConnection();
            
            //Preparando a query
            statement = connection.prepareStatement(sql);
            
            //Setando os valores
            statement.setInt(1, tagId);
            
            //Executando a query
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar a tag");
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
     }
}
     
    
    //  public List<Tag> getAll(int idProject) {
        
     //   String sql = "SELECT * FROM tag WHERE idProject = ?";
        
     //   Connection connection = null;
      //  PreparedStatement statement = null;
     //   ResultSet resultSet = null;
        
        //Lista de tarefas que será devolvida quando a chamada do meétodo acontecer
      //  List<Tag> tag = new ArrayList<Tag>();
         
       // try {
            //Criação da conexão
        //    connection = ConnectionFactory.getConnection();
        //    statement = connection.prepareStatement(sql);
            
            //Setando o valor que corresponde ao filtro de busca
         //   statement.setInt(1, idProject);
         //   resultSet = statement.executeQuery();
            
            //Enquanto houverem valores a serem pecorridos no mue resultSet
           // while(resultSet.next()){
                
            //    Tag tag = new Tag();
            //    tag.setId(resultSet.getInt("id"));
            //    tag.setIdProject(resultSet.getInt("idProject"));
            //    tag.setIdTask(resultSet.getInt("idTask"));
             //   tag.setTag(resultSet.getString("tag"));
                
                
            
            
        
       // } catch (SQLException ex) {
       //     throw new RuntimeException("Erro ao inserir  a tarefa" + ex.getMessage(), ex);
       // } finally {
       //     ConnectionFactory.closeConnection(connection, statement, resultSet);
       // }
       /// //Lista de tarefas que foi criada e carregada do banco de daddos
       // return tag;
        
        
        
        
       
    










