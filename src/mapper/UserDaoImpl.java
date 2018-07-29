package mapper;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import pojo.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

    @Override
    public User findUserById(int id) {
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectOne("findUserById",2);
    }
}
