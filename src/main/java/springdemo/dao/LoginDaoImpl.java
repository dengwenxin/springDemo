package springdemo.dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import springdemo.entity.LoginUser;

@Repository("MainDao")

public class LoginDaoImpl implements LoginDao {

    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Autowired
    @Qualifier("dataSourceMaster")
    public void setDatasource(DataSource datasource) {
        this.namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(datasource);

    }

    /**
     */
    public LoginUser selectLoginUser(String userName) {
        String sql = "SELECT "
                + " user_id, "
                + " user_name, "
                + " password "
                + "FROM user_master"
                +  " WHERE user_name= :userName";

        Map<String, Object> param = new HashMap<String, Object>();
        param.put("userName", userName);
        LoginUser loginUser =
                namedParameterJdbcTemplate.query(sql, param, new LoingUserResultSetExtractor());
        return loginUser;
    }
    
    protected class LoingUserResultSetExtractor implements ResultSetExtractor<LoginUser> {

        public LoginUser extractData(ResultSet rs) throws SQLException, DataAccessException {
            LoginUser loginUser = new LoginUser();
            
            if (rs.next()) {
                loginUser.setUserId(rs.getInt("user_id"));
                loginUser.setUserName(rs.getString("user_name"));
                loginUser.setPassword(rs.getString("password"));
            }
            return loginUser;
        }
    }
    
}