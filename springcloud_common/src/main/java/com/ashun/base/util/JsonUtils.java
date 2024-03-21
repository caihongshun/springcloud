package com.ashun.base.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * json
 */
public class JsonUtils {

    private static final Logger log = LoggerFactory.getLogger(JsonUtils.class);

    private static final ObjectMapper objectMapper = new ObjectMapper();

    static {
        // 不转换null
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    /**
     * json 转 object
     *
     * @param text json字符串
     * @param type 对象类型
     * @param <T>
     * @return 对象信息
     */
    public static <T> T parseObject(String text, Class<T> type) {
        if (!StringUtils.hasText(text)) {
            return null;
        }

        try {
            return objectMapper.readValue(text, type);
        } catch (Exception e) {
            throw new RuntimeException("json转object异常", e);
        }
    }

    /**
     * json 转 list
     *
     * @param text json字符串
     * @param type 集合元素类型
     * @param <T>
     * @return 对象集合
     */
    public static <T> List<T> parseList(String text, Class<T> type) {
        if (!StringUtils.hasText(text)) {
            return null;
        }

        try {
            JavaType javaType = objectMapper.getTypeFactory().constructParametricType(List.class, type);
            return objectMapper.readValue(text, javaType);
        } catch (Exception e) {
            throw new RuntimeException("json转list异常", e);
        }
    }

    /**
     * object 转 json
     *
     * @param object 对象
     * @return json字符串
     */
    public static String toJson(Object object) {
        if (object == null) {
            return null;
        }

        try {
            return objectMapper.writeValueAsString(object);
        } catch (Exception e) {
            throw new RuntimeException("object转json异常", e);
        }
    }
}
