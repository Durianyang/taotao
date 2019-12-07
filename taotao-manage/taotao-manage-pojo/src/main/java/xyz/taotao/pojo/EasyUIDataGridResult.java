package xyz.taotao.pojo;


import java.io.Serializable;
import java.util.List;

/**
 * Author: Durian
 * Date: 2019/11/21 19:14
 * Description: EasyUI页面展示数据的pojo，包含数据和总记录数
 */
public class EasyUIDataGridResult<T> implements Serializable
{
    private static final long serialVersionUID = -1952862309450020812L;
    private Integer total;
    private List<T> rows;

    public Integer getTotal()
    {
        return total;
    }

    public void setTotal(Integer total)
    {
        this.total = total;
    }

    public List<T> getRows()
    {
        return rows;
    }

    public void setRows(List<T> rows)
    {
        this.rows = rows;
    }
}
