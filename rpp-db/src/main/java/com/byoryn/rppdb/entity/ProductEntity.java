package com.byoryn.rppdb.entity;

import com.byoryn.rppdb.base.BaseEntity;
import com.byoryn.rppdb.enums.BoolType;
import com.byoryn.rppdb.enums.ProductStatusType;
import com.byoryn.rppdb.utils.CodeValueConverter;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

/**
 * @author panguangze
 * @data 2019/10/31
 */
@Setter
@Getter
@ToString
@Entity
public class ProductEntity extends BaseEntity {
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    private String uuid;
    private String customId;
    @Column(length = 30)
    private String name;
    @Column(columnDefinition = "text")
    private String profile;
    @Column(length = 120)
    private String productFirstImgPath;
    @Column(length = 120)
    private String productSecondImgPath;
    private float price;
    private int createUserId;
    private boolean analysis;
    private boolean generateReport;

    @Column(columnDefinition = "tinyint")
    @Convert(converter = CodeValueConverter.class)
    private ProductStatusType statusType;

    @ManyToOne
    @JoinColumn(name = "bio_pipline_id", referencedColumnName = "id")
    private BioPiplineEntity bioPipLineEntity;

    @OneToMany(cascade = {CascadeType.ALL})
    @JoinColumn(name = "product_id", referencedColumnName = "id")
    private Set<PanelEntity> panelEntities;

    @ManyToOne
    @JoinColumn(name = "shop_id", referencedColumnName = "id")
    private ShopEntity shopEntity;
}
