package com.xxpt.bean;

import java.util.Date;

public class Notice {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.n_id
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    private Integer nId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.n_author
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    private String nAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.n_title
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    private String nTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.n_content
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    private String nContent;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column notice.n_time
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    private Date nTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.n_id
     *
     * @return the value of notice.n_id
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public Integer getnId() {
        return nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.n_id
     *
     * @param nId the value for notice.n_id
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public void setnId(Integer nId) {
        this.nId = nId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.n_author
     *
     * @return the value of notice.n_author
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public String getnAuthor() {
        return nAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.n_author
     *
     * @param nAuthor the value for notice.n_author
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public void setnAuthor(String nAuthor) {
        this.nAuthor = nAuthor == null ? null : nAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.n_title
     *
     * @return the value of notice.n_title
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public String getnTitle() {
        return nTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.n_title
     *
     * @param nTitle the value for notice.n_title
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public void setnTitle(String nTitle) {
        this.nTitle = nTitle == null ? null : nTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.n_content
     *
     * @return the value of notice.n_content
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public String getnContent() {
        return nContent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.n_content
     *
     * @param nContent the value for notice.n_content
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column notice.n_time
     *
     * @return the value of notice.n_time
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public Date getnTime() {
        return nTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column notice.n_time
     *
     * @param nTime the value for notice.n_time
     *
     * @mbg.generated Mon Apr 08 14:21:51 CST 2019
     */
    public void setnTime(Date nTime) {
        this.nTime = nTime;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "nId=" + nId +
                ", nAuthor='" + nAuthor + '\'' +
                ", nTitle='" + nTitle + '\'' +
                ", nContent='" + nContent + '\'' +
                ", nTime=" + nTime +
                '}';
    }
}