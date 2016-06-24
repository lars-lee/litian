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

    private String fastInfo;

    private Long mid;

    private Date cDate;

    private Date uDate;

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

    public String getFastInfo() {
        return fastInfo;
    }

    public void setFastInfo(String fastInfo) {
        this.fastInfo = fastInfo;
    }

    public Long getMid() {
        return mid;
    }

    public void setMid(Long mid) {
        this.mid = mid;
    }

    public Date getcDate() {
        return cDate;
    }

    public void setcDate(Date cDate) {
        this.cDate = cDate;
    }

    public Date getuDate() {
        return uDate;
    }

    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ArticleBean{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", content=");
        if (content == null) sb.append("null");
        else {
            sb.append('[');
            for (int i = 0; i < content.length; ++i)
                sb.append(i == 0 ? "" : ", ").append(content[i]);
            sb.append(']');
        }
        sb.append(", fastInfo='").append(fastInfo).append('\'');
        sb.append(", mid=").append(mid);
        sb.append(", cDate=").append(cDate);
        sb.append(", uDate=").append(uDate);
        sb.append('}');
        return sb.toString();
    }
}
