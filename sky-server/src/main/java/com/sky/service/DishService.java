package com.sky.service;

import com.sky.dto.DishDTO;

public interface DishService {
    /**
     *新增菜品和口味信息
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
