package com.litian.web.blog.entity;

import com.litian.web.blog.constant.WebConstant;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by litian on 2016/6/16.
 */
public class ArticleBean {

    private Long id;

    private String title;

    private byte[] content;

    private Long mid;

    private Date cdate;

    private Date udate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Date cdate) {
        this.cdate = cdate;
    }

    public Date getUdate() {
        return udate;
    }

    public void setUdate(Date udate) {
        this.udate = udate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ArticleBean [id=");
        sb.append(id);
        sb.append(", title=");
        sb.append(title);
        sb.append(", orign content=");
        sb.append(Arrays.toString(content) + "\n");
        sb.append(", content=");
        if (content == null)
            sb.append("null");
        else {
            try {
                sb.append(new String(content, WebConstant.DEFAULT_CHARSET));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        sb.append(", mid=");
        sb.append(mid);
        sb.append(", cdate=");
        sb.append(cdate);
        sb.append(", udate=");
        sb.append(udate);
        sb.append("]");
        return sb.toString();
    }

}
