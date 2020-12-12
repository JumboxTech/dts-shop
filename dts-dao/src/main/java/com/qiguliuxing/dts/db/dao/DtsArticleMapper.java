package com.qiguliuxing.dts.db.dao;

import com.qiguliuxing.dts.db.domain.DtsArticle;
import com.qiguliuxing.dts.db.domain.DtsArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DtsArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    long countByExample(DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int deleteByExample(DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int insert(DtsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int insertSelective(DtsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsArticle selectOneByExample(DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsArticle selectOneByExampleSelective(@Param("example") DtsArticleExample example, @Param("selective") DtsArticle.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsArticle selectOneByExampleWithBLOBs(DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    List<DtsArticle> selectByExampleSelective(@Param("example") DtsArticleExample example, @Param("selective") DtsArticle.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    List<DtsArticle> selectByExampleWithBLOBs(DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    List<DtsArticle> selectByExample(DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsArticle selectByPrimaryKeySelective(@Param("id") Integer id, @Param("selective") DtsArticle.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    DtsArticle selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    DtsArticle selectByPrimaryKeyWithLogicalDelete(@Param("id") Integer id, @Param("andLogicalDeleted") boolean andLogicalDeleted);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") DtsArticle record, @Param("example") DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") DtsArticle record, @Param("example") DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") DtsArticle record, @Param("example") DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DtsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(DtsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DtsArticle record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByExample(@Param("example") DtsArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table dts_article
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    int logicalDeleteByPrimaryKey(Integer id);
}