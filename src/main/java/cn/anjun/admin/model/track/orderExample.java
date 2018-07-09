package cn.anjun.admin.model.track;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class orderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public orderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("app_id is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("app_id is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(Integer value) {
            addCriterion("app_id =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Integer value) {
            addCriterion("app_id <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Integer value) {
            addCriterion("app_id >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("app_id >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Integer value) {
            addCriterion("app_id <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Integer value) {
            addCriterion("app_id <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Integer> values) {
            addCriterion("app_id in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Integer> values) {
            addCriterion("app_id not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Integer value1, Integer value2) {
            addCriterion("app_id between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Integer value1, Integer value2) {
            addCriterion("app_id not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNull() {
            addCriterion("package_id is null");
            return (Criteria) this;
        }

        public Criteria andPackageIdIsNotNull() {
            addCriterion("package_id is not null");
            return (Criteria) this;
        }

        public Criteria andPackageIdEqualTo(Integer value) {
            addCriterion("package_id =", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotEqualTo(Integer value) {
            addCriterion("package_id <>", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThan(Integer value) {
            addCriterion("package_id >", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_id >=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThan(Integer value) {
            addCriterion("package_id <", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdLessThanOrEqualTo(Integer value) {
            addCriterion("package_id <=", value, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdIn(List<Integer> values) {
            addCriterion("package_id in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotIn(List<Integer> values) {
            addCriterion("package_id not in", values, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdBetween(Integer value1, Integer value2) {
            addCriterion("package_id between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andPackageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("package_id not between", value1, value2, "packageId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdIsNull() {
            addCriterion("game_user_id is null");
            return (Criteria) this;
        }

        public Criteria andGameUserIdIsNotNull() {
            addCriterion("game_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameUserIdEqualTo(String value) {
            addCriterion("game_user_id =", value, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdNotEqualTo(String value) {
            addCriterion("game_user_id <>", value, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdGreaterThan(String value) {
            addCriterion("game_user_id >", value, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("game_user_id >=", value, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdLessThan(String value) {
            addCriterion("game_user_id <", value, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdLessThanOrEqualTo(String value) {
            addCriterion("game_user_id <=", value, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdLike(String value) {
            addCriterion("game_user_id like", value, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdNotLike(String value) {
            addCriterion("game_user_id not like", value, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdIn(List<String> values) {
            addCriterion("game_user_id in", values, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdNotIn(List<String> values) {
            addCriterion("game_user_id not in", values, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdBetween(String value1, String value2) {
            addCriterion("game_user_id between", value1, value2, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andGameUserIdNotBetween(String value1, String value2) {
            addCriterion("game_user_id not between", value1, value2, "gameUserId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNull() {
            addCriterion("transaction_id is null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIsNotNull() {
            addCriterion("transaction_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionIdEqualTo(String value) {
            addCriterion("transaction_id =", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotEqualTo(String value) {
            addCriterion("transaction_id <>", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThan(String value) {
            addCriterion("transaction_id >", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("transaction_id >=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThan(String value) {
            addCriterion("transaction_id <", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("transaction_id <=", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdLike(String value) {
            addCriterion("transaction_id like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotLike(String value) {
            addCriterion("transaction_id not like", value, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdIn(List<String> values) {
            addCriterion("transaction_id in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotIn(List<String> values) {
            addCriterion("transaction_id not in", values, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdBetween(String value1, String value2) {
            addCriterion("transaction_id between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andTransactionIdNotBetween(String value1, String value2) {
            addCriterion("transaction_id not between", value1, value2, "transactionId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdIsNull() {
            addCriterion("game_order_id is null");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdIsNotNull() {
            addCriterion("game_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdEqualTo(String value) {
            addCriterion("game_order_id =", value, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdNotEqualTo(String value) {
            addCriterion("game_order_id <>", value, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdGreaterThan(String value) {
            addCriterion("game_order_id >", value, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("game_order_id >=", value, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdLessThan(String value) {
            addCriterion("game_order_id <", value, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdLessThanOrEqualTo(String value) {
            addCriterion("game_order_id <=", value, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdLike(String value) {
            addCriterion("game_order_id like", value, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdNotLike(String value) {
            addCriterion("game_order_id not like", value, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdIn(List<String> values) {
            addCriterion("game_order_id in", values, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdNotIn(List<String> values) {
            addCriterion("game_order_id not in", values, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdBetween(String value1, String value2) {
            addCriterion("game_order_id between", value1, value2, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andGameOrderIdNotBetween(String value1, String value2) {
            addCriterion("game_order_id not between", value1, value2, "gameOrderId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdIsNull() {
            addCriterion("third_game_zone_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdIsNotNull() {
            addCriterion("third_game_zone_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdEqualTo(String value) {
            addCriterion("third_game_zone_id =", value, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdNotEqualTo(String value) {
            addCriterion("third_game_zone_id <>", value, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdGreaterThan(String value) {
            addCriterion("third_game_zone_id >", value, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdGreaterThanOrEqualTo(String value) {
            addCriterion("third_game_zone_id >=", value, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdLessThan(String value) {
            addCriterion("third_game_zone_id <", value, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdLessThanOrEqualTo(String value) {
            addCriterion("third_game_zone_id <=", value, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdLike(String value) {
            addCriterion("third_game_zone_id like", value, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdNotLike(String value) {
            addCriterion("third_game_zone_id not like", value, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdIn(List<String> values) {
            addCriterion("third_game_zone_id in", values, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdNotIn(List<String> values) {
            addCriterion("third_game_zone_id not in", values, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdBetween(String value1, String value2) {
            addCriterion("third_game_zone_id between", value1, value2, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andThirdGameZoneIdNotBetween(String value1, String value2) {
            addCriterion("third_game_zone_id not between", value1, value2, "thirdGameZoneId");
            return (Criteria) this;
        }

        public Criteria andCardCodeIsNull() {
            addCriterion("card_code is null");
            return (Criteria) this;
        }

        public Criteria andCardCodeIsNotNull() {
            addCriterion("card_code is not null");
            return (Criteria) this;
        }

        public Criteria andCardCodeEqualTo(Byte value) {
            addCriterion("card_code =", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotEqualTo(Byte value) {
            addCriterion("card_code <>", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeGreaterThan(Byte value) {
            addCriterion("card_code >", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("card_code >=", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeLessThan(Byte value) {
            addCriterion("card_code <", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeLessThanOrEqualTo(Byte value) {
            addCriterion("card_code <=", value, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeIn(List<Byte> values) {
            addCriterion("card_code in", values, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotIn(List<Byte> values) {
            addCriterion("card_code not in", values, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeBetween(Byte value1, Byte value2) {
            addCriterion("card_code between", value1, value2, "cardCode");
            return (Criteria) this;
        }

        public Criteria andCardCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("card_code not between", value1, value2, "cardCode");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNull() {
            addCriterion("role_name is null");
            return (Criteria) this;
        }

        public Criteria andRoleNameIsNotNull() {
            addCriterion("role_name is not null");
            return (Criteria) this;
        }

        public Criteria andRoleNameEqualTo(String value) {
            addCriterion("role_name =", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotEqualTo(String value) {
            addCriterion("role_name <>", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThan(String value) {
            addCriterion("role_name >", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("role_name >=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThan(String value) {
            addCriterion("role_name <", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLessThanOrEqualTo(String value) {
            addCriterion("role_name <=", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameLike(String value) {
            addCriterion("role_name like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotLike(String value) {
            addCriterion("role_name not like", value, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameIn(List<String> values) {
            addCriterion("role_name in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotIn(List<String> values) {
            addCriterion("role_name not in", values, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameBetween(String value1, String value2) {
            addCriterion("role_name between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andRoleNameNotBetween(String value1, String value2) {
            addCriterion("role_name not between", value1, value2, "roleName");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNull() {
            addCriterion("vip_level is null");
            return (Criteria) this;
        }

        public Criteria andVipLevelIsNotNull() {
            addCriterion("vip_level is not null");
            return (Criteria) this;
        }

        public Criteria andVipLevelEqualTo(Integer value) {
            addCriterion("vip_level =", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotEqualTo(Integer value) {
            addCriterion("vip_level <>", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThan(Integer value) {
            addCriterion("vip_level >", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("vip_level >=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThan(Integer value) {
            addCriterion("vip_level <", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelLessThanOrEqualTo(Integer value) {
            addCriterion("vip_level <=", value, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelIn(List<Integer> values) {
            addCriterion("vip_level in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotIn(List<Integer> values) {
            addCriterion("vip_level not in", values, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelBetween(Integer value1, Integer value2) {
            addCriterion("vip_level between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andVipLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("vip_level not between", value1, value2, "vipLevel");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Byte value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Byte value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Byte value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Byte value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Byte value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Byte value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Byte> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Byte> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Byte value1, Byte value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Byte value1, Byte value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNull() {
            addCriterion("pay_channel is null");
            return (Criteria) this;
        }

        public Criteria andPayChannelIsNotNull() {
            addCriterion("pay_channel is not null");
            return (Criteria) this;
        }

        public Criteria andPayChannelEqualTo(Byte value) {
            addCriterion("pay_channel =", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotEqualTo(Byte value) {
            addCriterion("pay_channel <>", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThan(Byte value) {
            addCriterion("pay_channel >", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelGreaterThanOrEqualTo(Byte value) {
            addCriterion("pay_channel >=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThan(Byte value) {
            addCriterion("pay_channel <", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelLessThanOrEqualTo(Byte value) {
            addCriterion("pay_channel <=", value, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelIn(List<Byte> values) {
            addCriterion("pay_channel in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotIn(List<Byte> values) {
            addCriterion("pay_channel not in", values, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelBetween(Byte value1, Byte value2) {
            addCriterion("pay_channel between", value1, value2, "payChannel");
            return (Criteria) this;
        }

        public Criteria andPayChannelNotBetween(Byte value1, Byte value2) {
            addCriterion("pay_channel not between", value1, value2, "payChannel");
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

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andGameCoinIsNull() {
            addCriterion("game_coin is null");
            return (Criteria) this;
        }

        public Criteria andGameCoinIsNotNull() {
            addCriterion("game_coin is not null");
            return (Criteria) this;
        }

        public Criteria andGameCoinEqualTo(Integer value) {
            addCriterion("game_coin =", value, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinNotEqualTo(Integer value) {
            addCriterion("game_coin <>", value, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinGreaterThan(Integer value) {
            addCriterion("game_coin >", value, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_coin >=", value, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinLessThan(Integer value) {
            addCriterion("game_coin <", value, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinLessThanOrEqualTo(Integer value) {
            addCriterion("game_coin <=", value, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinIn(List<Integer> values) {
            addCriterion("game_coin in", values, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinNotIn(List<Integer> values) {
            addCriterion("game_coin not in", values, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinBetween(Integer value1, Integer value2) {
            addCriterion("game_coin between", value1, value2, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinNotBetween(Integer value1, Integer value2) {
            addCriterion("game_coin not between", value1, value2, "gameCoin");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyIsNull() {
            addCriterion("game_coin_currency is null");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyIsNotNull() {
            addCriterion("game_coin_currency is not null");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyEqualTo(String value) {
            addCriterion("game_coin_currency =", value, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyNotEqualTo(String value) {
            addCriterion("game_coin_currency <>", value, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyGreaterThan(String value) {
            addCriterion("game_coin_currency >", value, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("game_coin_currency >=", value, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyLessThan(String value) {
            addCriterion("game_coin_currency <", value, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyLessThanOrEqualTo(String value) {
            addCriterion("game_coin_currency <=", value, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyLike(String value) {
            addCriterion("game_coin_currency like", value, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyNotLike(String value) {
            addCriterion("game_coin_currency not like", value, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyIn(List<String> values) {
            addCriterion("game_coin_currency in", values, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyNotIn(List<String> values) {
            addCriterion("game_coin_currency not in", values, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyBetween(String value1, String value2) {
            addCriterion("game_coin_currency between", value1, value2, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andGameCoinCurrencyNotBetween(String value1, String value2) {
            addCriterion("game_coin_currency not between", value1, value2, "gameCoinCurrency");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andOrderEnvIsNull() {
            addCriterion("order_env is null");
            return (Criteria) this;
        }

        public Criteria andOrderEnvIsNotNull() {
            addCriterion("order_env is not null");
            return (Criteria) this;
        }

        public Criteria andOrderEnvEqualTo(Byte value) {
            addCriterion("order_env =", value, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvNotEqualTo(Byte value) {
            addCriterion("order_env <>", value, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvGreaterThan(Byte value) {
            addCriterion("order_env >", value, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_env >=", value, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvLessThan(Byte value) {
            addCriterion("order_env <", value, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvLessThanOrEqualTo(Byte value) {
            addCriterion("order_env <=", value, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvIn(List<Byte> values) {
            addCriterion("order_env in", values, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvNotIn(List<Byte> values) {
            addCriterion("order_env not in", values, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvBetween(Byte value1, Byte value2) {
            addCriterion("order_env between", value1, value2, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andOrderEnvNotBetween(Byte value1, Byte value2) {
            addCriterion("order_env not between", value1, value2, "orderEnv");
            return (Criteria) this;
        }

        public Criteria andRefundIsNull() {
            addCriterion("refund is null");
            return (Criteria) this;
        }

        public Criteria andRefundIsNotNull() {
            addCriterion("refund is not null");
            return (Criteria) this;
        }

        public Criteria andRefundEqualTo(Byte value) {
            addCriterion("refund =", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotEqualTo(Byte value) {
            addCriterion("refund <>", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThan(Byte value) {
            addCriterion("refund >", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundGreaterThanOrEqualTo(Byte value) {
            addCriterion("refund >=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThan(Byte value) {
            addCriterion("refund <", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundLessThanOrEqualTo(Byte value) {
            addCriterion("refund <=", value, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundIn(List<Byte> values) {
            addCriterion("refund in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotIn(List<Byte> values) {
            addCriterion("refund not in", values, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundBetween(Byte value1, Byte value2) {
            addCriterion("refund between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andRefundNotBetween(Byte value1, Byte value2) {
            addCriterion("refund not between", value1, value2, "refund");
            return (Criteria) this;
        }

        public Criteria andPostGameServerIsNull() {
            addCriterion("post_game_server is null");
            return (Criteria) this;
        }

        public Criteria andPostGameServerIsNotNull() {
            addCriterion("post_game_server is not null");
            return (Criteria) this;
        }

        public Criteria andPostGameServerEqualTo(Byte value) {
            addCriterion("post_game_server =", value, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerNotEqualTo(Byte value) {
            addCriterion("post_game_server <>", value, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerGreaterThan(Byte value) {
            addCriterion("post_game_server >", value, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerGreaterThanOrEqualTo(Byte value) {
            addCriterion("post_game_server >=", value, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerLessThan(Byte value) {
            addCriterion("post_game_server <", value, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerLessThanOrEqualTo(Byte value) {
            addCriterion("post_game_server <=", value, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerIn(List<Byte> values) {
            addCriterion("post_game_server in", values, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerNotIn(List<Byte> values) {
            addCriterion("post_game_server not in", values, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerBetween(Byte value1, Byte value2) {
            addCriterion("post_game_server between", value1, value2, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andPostGameServerNotBetween(Byte value1, Byte value2) {
            addCriterion("post_game_server not between", value1, value2, "postGameServer");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNull() {
            addCriterion("ip_address is null");
            return (Criteria) this;
        }

        public Criteria andIpAddressIsNotNull() {
            addCriterion("ip_address is not null");
            return (Criteria) this;
        }

        public Criteria andIpAddressEqualTo(Long value) {
            addCriterion("ip_address =", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotEqualTo(Long value) {
            addCriterion("ip_address <>", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThan(Long value) {
            addCriterion("ip_address >", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressGreaterThanOrEqualTo(Long value) {
            addCriterion("ip_address >=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThan(Long value) {
            addCriterion("ip_address <", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressLessThanOrEqualTo(Long value) {
            addCriterion("ip_address <=", value, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressIn(List<Long> values) {
            addCriterion("ip_address in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotIn(List<Long> values) {
            addCriterion("ip_address not in", values, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressBetween(Long value1, Long value2) {
            addCriterion("ip_address between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andIpAddressNotBetween(Long value1, Long value2) {
            addCriterion("ip_address not between", value1, value2, "ipAddress");
            return (Criteria) this;
        }

        public Criteria andCountryIsNull() {
            addCriterion("country is null");
            return (Criteria) this;
        }

        public Criteria andCountryIsNotNull() {
            addCriterion("country is not null");
            return (Criteria) this;
        }

        public Criteria andCountryEqualTo(String value) {
            addCriterion("country =", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotEqualTo(String value) {
            addCriterion("country <>", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThan(String value) {
            addCriterion("country >", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryGreaterThanOrEqualTo(String value) {
            addCriterion("country >=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThan(String value) {
            addCriterion("country <", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLessThanOrEqualTo(String value) {
            addCriterion("country <=", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryLike(String value) {
            addCriterion("country like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotLike(String value) {
            addCriterion("country not like", value, "country");
            return (Criteria) this;
        }

        public Criteria andCountryIn(List<String> values) {
            addCriterion("country in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotIn(List<String> values) {
            addCriterion("country not in", values, "country");
            return (Criteria) this;
        }

        public Criteria andCountryBetween(String value1, String value2) {
            addCriterion("country between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andCountryNotBetween(String value1, String value2) {
            addCriterion("country not between", value1, value2, "country");
            return (Criteria) this;
        }

        public Criteria andGameExtIsNull() {
            addCriterion("game_ext is null");
            return (Criteria) this;
        }

        public Criteria andGameExtIsNotNull() {
            addCriterion("game_ext is not null");
            return (Criteria) this;
        }

        public Criteria andGameExtEqualTo(String value) {
            addCriterion("game_ext =", value, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtNotEqualTo(String value) {
            addCriterion("game_ext <>", value, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtGreaterThan(String value) {
            addCriterion("game_ext >", value, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtGreaterThanOrEqualTo(String value) {
            addCriterion("game_ext >=", value, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtLessThan(String value) {
            addCriterion("game_ext <", value, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtLessThanOrEqualTo(String value) {
            addCriterion("game_ext <=", value, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtLike(String value) {
            addCriterion("game_ext like", value, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtNotLike(String value) {
            addCriterion("game_ext not like", value, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtIn(List<String> values) {
            addCriterion("game_ext in", values, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtNotIn(List<String> values) {
            addCriterion("game_ext not in", values, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtBetween(String value1, String value2) {
            addCriterion("game_ext between", value1, value2, "gameExt");
            return (Criteria) this;
        }

        public Criteria andGameExtNotBetween(String value1, String value2) {
            addCriterion("game_ext not between", value1, value2, "gameExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtIsNull() {
            addCriterion("channel_ext is null");
            return (Criteria) this;
        }

        public Criteria andChannelExtIsNotNull() {
            addCriterion("channel_ext is not null");
            return (Criteria) this;
        }

        public Criteria andChannelExtEqualTo(String value) {
            addCriterion("channel_ext =", value, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtNotEqualTo(String value) {
            addCriterion("channel_ext <>", value, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtGreaterThan(String value) {
            addCriterion("channel_ext >", value, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtGreaterThanOrEqualTo(String value) {
            addCriterion("channel_ext >=", value, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtLessThan(String value) {
            addCriterion("channel_ext <", value, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtLessThanOrEqualTo(String value) {
            addCriterion("channel_ext <=", value, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtLike(String value) {
            addCriterion("channel_ext like", value, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtNotLike(String value) {
            addCriterion("channel_ext not like", value, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtIn(List<String> values) {
            addCriterion("channel_ext in", values, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtNotIn(List<String> values) {
            addCriterion("channel_ext not in", values, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtBetween(String value1, String value2) {
            addCriterion("channel_ext between", value1, value2, "channelExt");
            return (Criteria) this;
        }

        public Criteria andChannelExtNotBetween(String value1, String value2) {
            addCriterion("channel_ext not between", value1, value2, "channelExt");
            return (Criteria) this;
        }

        public Criteria andClientTimeIsNull() {
            addCriterion("client_time is null");
            return (Criteria) this;
        }

        public Criteria andClientTimeIsNotNull() {
            addCriterion("client_time is not null");
            return (Criteria) this;
        }

        public Criteria andClientTimeEqualTo(Date value) {
            addCriterion("client_time =", value, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeNotEqualTo(Date value) {
            addCriterion("client_time <>", value, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeGreaterThan(Date value) {
            addCriterion("client_time >", value, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("client_time >=", value, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeLessThan(Date value) {
            addCriterion("client_time <", value, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeLessThanOrEqualTo(Date value) {
            addCriterion("client_time <=", value, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeIn(List<Date> values) {
            addCriterion("client_time in", values, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeNotIn(List<Date> values) {
            addCriterion("client_time not in", values, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeBetween(Date value1, Date value2) {
            addCriterion("client_time between", value1, value2, "clientTime");
            return (Criteria) this;
        }

        public Criteria andClientTimeNotBetween(Date value1, Date value2) {
            addCriterion("client_time not between", value1, value2, "clientTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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