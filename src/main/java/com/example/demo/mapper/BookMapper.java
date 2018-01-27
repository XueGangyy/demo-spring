package com.example.demo.mapper;

import com.example.demo.model.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_baseinf
     *
     * @mbggenerated
     */
    @Delete({
        "delete from book_baseinf",
        "where book_id = #{bookId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_baseinf
     *
     * @mbggenerated
     */
    @Insert({
        "insert into book_baseinf (book_id, book_title, ",
        "book_publishment, book_neworold, ",
        "book_author, book_img)",
        "values (#{bookId,jdbcType=INTEGER}, #{bookTitle,jdbcType=VARCHAR}, ",
        "#{bookPublishment,jdbcType=VARCHAR}, #{bookNeworold,jdbcType=VARCHAR}, ",
        "#{bookAuthor,jdbcType=VARCHAR}, #{bookImg,jdbcType=LONGVARCHAR})"
    })
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_baseinf
     *
     * @mbggenerated
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_baseinf
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "book_id, book_title, book_publishment, book_neworold, book_author, book_img",
        "from book_baseinf",
        "where book_id = #{bookId,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    Book selectByPrimaryKey(Integer bookId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_baseinf
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_baseinf
     *
     * @mbggenerated
     */
    @Update({
        "update book_baseinf",
        "set book_title = #{bookTitle,jdbcType=VARCHAR},",
          "book_publishment = #{bookPublishment,jdbcType=VARCHAR},",
          "book_neworold = #{bookNeworold,jdbcType=VARCHAR},",
          "book_author = #{bookAuthor,jdbcType=VARCHAR},",
          "book_img = #{bookImg,jdbcType=LONGVARCHAR}",
        "where book_id = #{bookId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_baseinf
     *
     * @mbggenerated
     */
    @Update({
        "update book_baseinf",
        "set book_title = #{bookTitle,jdbcType=VARCHAR},",
          "book_publishment = #{bookPublishment,jdbcType=VARCHAR},",
          "book_neworold = #{bookNeworold,jdbcType=VARCHAR},",
          "book_author = #{bookAuthor,jdbcType=VARCHAR}",
        "where book_id = #{bookId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Book record);
}