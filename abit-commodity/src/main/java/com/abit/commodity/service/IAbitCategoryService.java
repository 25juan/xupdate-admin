package com.abit.commodity.service;

import java.util.List;
import com.abit.commodity.domain.AbitCategory;

/**
 * 商品分类Service接口
 * 
 * @author ruoyi
 * @date 2020-09-17
 */
public interface IAbitCategoryService 
{
    /**
     * 查询商品分类
     * 
     * @param id 商品分类ID
     * @return 商品分类
     */
    public AbitCategory selectAbitCategoryById(Long id);

    /**
     * 查询商品分类列表
     * 
     * @param abitCategory 商品分类
     * @return 商品分类集合
     */
    public List<AbitCategory> selectAbitCategoryList(AbitCategory abitCategory);

    /**
     * 新增商品分类
     * 
     * @param abitCategory 商品分类
     * @return 结果
     */
    public int insertAbitCategory(AbitCategory abitCategory);

    /**
     * 修改商品分类
     * 
     * @param abitCategory 商品分类
     * @return 结果
     */
    public int updateAbitCategory(AbitCategory abitCategory);

    /**
     * 批量删除商品分类
     * 
     * @param ids 需要删除的商品分类ID
     * @return 结果
     */
    public int deleteAbitCategoryByIds(Long[] ids);

    /**
     * 删除商品分类信息
     * 
     * @param id 商品分类ID
     * @return 结果
     */
    public int deleteAbitCategoryById(Long id);
}
