package com.yunyitg.cesp.core.imports.book.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "book_log")
public class BookLog {
    /**
     * pk
     */
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 关联账册主键id
     */
    @Column(name = "book_id")
    private Integer bookId;

    /**
     * 库存类型
     */
    @Column(name = "inventory_type")
    private String inventoryType;

    /**
     * 入出库标志（I-入库，O-出库）
     */
    @Column(name = "io_flag")
    private String ioFlag;

    /**
     * 入出库数量
     */
    @Column(name = "qty")
    private BigDecimal qty;

    /**
     * 入出库日期
     */
    @Column(name = "io_date")
    private Date ioDate;

    /**
     * 单据编号
     */
    @Column(name = "corr_doc_code")
    private String corrDocCode;

    /**
     * 单据类型
     */
    @Column(name = "corrt_doc_type")
    private String corrtDocType;

    /**
     * 备注
     */
    @Column(name = "notes")
    private String notes;

    /**
     * 获取pk
     *
     * @return id - pk
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置pk
     *
     * @param id pk
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取关联账册主键id
     *
     * @return book_id - 关联账册主键id
     */
    public Integer getBookId() {
        return bookId;
    }

    /**
     * 设置关联账册主键id
     *
     * @param bookId 关联账册主键id
     */
    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    /**
     * 获取库存类型
     *
     * @return inventory_type - 库存类型
     */
    public String getInventoryType() {
        return inventoryType;
    }

    /**
     * 设置库存类型
     *
     * @param inventoryType 库存类型
     */
    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    /**
     * 获取入出库标志（I-入库，O-出库）
     *
     * @return io_flag - 入出库标志（I-入库，O-出库）
     */
    public String getIoFlag() {
        return ioFlag;
    }

    /**
     * 设置入出库标志（I-入库，O-出库）
     *
     * @param ioFlag 入出库标志（I-入库，O-出库）
     */
    public void setIoFlag(String ioFlag) {
        this.ioFlag = ioFlag;
    }

    /**
     * 获取入出库数量
     *
     * @return qty - 入出库数量
     */
    public BigDecimal getQty() {
        return qty;
    }

    /**
     * 设置入出库数量
     *
     * @param qty 入出库数量
     */
    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    /**
     * 获取入出库日期
     *
     * @return io_date - 入出库日期
     */
    public Date getIoDate() {
        return ioDate;
    }

    /**
     * 设置入出库日期
     *
     * @param ioDate 入出库日期
     */
    public void setIoDate(Date ioDate) {
        this.ioDate = ioDate;
    }

    /**
     * 获取单据编号
     *
     * @return corr_doc_code - 单据编号
     */
    public String getCorrDocCode() {
        return corrDocCode;
    }

    /**
     * 设置单据编号
     *
     * @param corrDocCode 单据编号
     */
    public void setCorrDocCode(String corrDocCode) {
        this.corrDocCode = corrDocCode;
    }

    /**
     * 获取单据类型
     *
     * @return corrt_doc_type - 单据类型
     */
    public String getCorrtDocType() {
        return corrtDocType;
    }

    /**
     * 设置单据类型
     *
     * @param corrtDocType 单据类型
     */
    public void setCorrtDocType(String corrtDocType) {
        this.corrtDocType = corrtDocType;
    }

    /**
     * 获取备注
     *
     * @return notes - 备注
     */
    public String getNotes() {
        return notes;
    }

    /**
     * 设置备注
     *
     * @param notes 备注
     */
    public void setNotes(String notes) {
        this.notes = notes;
    }
}