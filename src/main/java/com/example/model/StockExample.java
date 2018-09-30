package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class StockExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public StockExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Long value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Long value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Long value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Long value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Long value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Long> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Long> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Long value1, Long value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Long value1, Long value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNull() {
            addCriterion("warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIsNotNull() {
            addCriterion("warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdEqualTo(Integer value) {
            addCriterion("warehouse_id =", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotEqualTo(Integer value) {
            addCriterion("warehouse_id <>", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThan(Integer value) {
            addCriterion("warehouse_id >", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id >=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThan(Integer value) {
            addCriterion("warehouse_id <", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("warehouse_id <=", value, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdIn(List<Integer> values) {
            addCriterion("warehouse_id in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotIn(List<Integer> values) {
            addCriterion("warehouse_id not in", values, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("warehouse_id not between", value1, value2, "warehouseId");
            return (Criteria) this;
        }

        public Criteria andStockCountIsNull() {
            addCriterion("stock_count is null");
            return (Criteria) this;
        }

        public Criteria andStockCountIsNotNull() {
            addCriterion("stock_count is not null");
            return (Criteria) this;
        }

        public Criteria andStockCountEqualTo(Integer value) {
            addCriterion("stock_count =", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotEqualTo(Integer value) {
            addCriterion("stock_count <>", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountGreaterThan(Integer value) {
            addCriterion("stock_count >", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_count >=", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountLessThan(Integer value) {
            addCriterion("stock_count <", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountLessThanOrEqualTo(Integer value) {
            addCriterion("stock_count <=", value, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountIn(List<Integer> values) {
            addCriterion("stock_count in", values, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotIn(List<Integer> values) {
            addCriterion("stock_count not in", values, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountBetween(Integer value1, Integer value2) {
            addCriterion("stock_count between", value1, value2, "stockCount");
            return (Criteria) this;
        }

        public Criteria andStockCountNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_count not between", value1, value2, "stockCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountIsNull() {
            addCriterion("avaliable_count is null");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountIsNotNull() {
            addCriterion("avaliable_count is not null");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountEqualTo(Integer value) {
            addCriterion("avaliable_count =", value, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountNotEqualTo(Integer value) {
            addCriterion("avaliable_count <>", value, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountGreaterThan(Integer value) {
            addCriterion("avaliable_count >", value, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("avaliable_count >=", value, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountLessThan(Integer value) {
            addCriterion("avaliable_count <", value, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountLessThanOrEqualTo(Integer value) {
            addCriterion("avaliable_count <=", value, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountIn(List<Integer> values) {
            addCriterion("avaliable_count in", values, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountNotIn(List<Integer> values) {
            addCriterion("avaliable_count not in", values, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountBetween(Integer value1, Integer value2) {
            addCriterion("avaliable_count between", value1, value2, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAvaliableCountNotBetween(Integer value1, Integer value2) {
            addCriterion("avaliable_count not between", value1, value2, "avaliableCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountIsNull() {
            addCriterion("allocated_count is null");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountIsNotNull() {
            addCriterion("allocated_count is not null");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountEqualTo(Integer value) {
            addCriterion("allocated_count =", value, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountNotEqualTo(Integer value) {
            addCriterion("allocated_count <>", value, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountGreaterThan(Integer value) {
            addCriterion("allocated_count >", value, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("allocated_count >=", value, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountLessThan(Integer value) {
            addCriterion("allocated_count <", value, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountLessThanOrEqualTo(Integer value) {
            addCriterion("allocated_count <=", value, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountIn(List<Integer> values) {
            addCriterion("allocated_count in", values, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountNotIn(List<Integer> values) {
            addCriterion("allocated_count not in", values, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountBetween(Integer value1, Integer value2) {
            addCriterion("allocated_count between", value1, value2, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andAllocatedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("allocated_count not between", value1, value2, "allocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountIsNull() {
            addCriterion("unallocated_count is null");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountIsNotNull() {
            addCriterion("unallocated_count is not null");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountEqualTo(Integer value) {
            addCriterion("unallocated_count =", value, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountNotEqualTo(Integer value) {
            addCriterion("unallocated_count <>", value, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountGreaterThan(Integer value) {
            addCriterion("unallocated_count >", value, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("unallocated_count >=", value, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountLessThan(Integer value) {
            addCriterion("unallocated_count <", value, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountLessThanOrEqualTo(Integer value) {
            addCriterion("unallocated_count <=", value, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountIn(List<Integer> values) {
            addCriterion("unallocated_count in", values, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountNotIn(List<Integer> values) {
            addCriterion("unallocated_count not in", values, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountBetween(Integer value1, Integer value2) {
            addCriterion("unallocated_count between", value1, value2, "unallocatedCount");
            return (Criteria) this;
        }

        public Criteria andUnallocatedCountNotBetween(Integer value1, Integer value2) {
            addCriterion("unallocated_count not between", value1, value2, "unallocatedCount");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stock
     *
     * @mbg.generated do_not_delete_during_merge Sun Sep 30 21:13:13 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table stock
     *
     * @mbg.generated Sun Sep 30 21:13:13 CST 2018
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}