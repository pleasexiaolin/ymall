package com.ymall.service.impl;

import cn.hutool.core.bean.BeanUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Test;

public class HutoolTest {

    @Test
    void name() {
        User jack = User.of(1L, "jack");
        User2 u2 = new User2();
        BeanUtil.copyProperties(jack, u2);
        System.out.println("user2 = " + u2);
    }

    @Data
    @NoArgsConstructor
    @AllArgsConstructor(staticName = "of")
    static class User {
        Long id;
        String name;
    }

    @Data
    static class User2 {
        String id;
        String name;
    }

    // 生成一个32位以上的字符串做Base64加密
    @Test
    void test() {
        // 生成一个32位以上的随机字符串
        String originalString = "abcdefghijklmnopqrstuvwxyz1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        // 使用Hutool进行Base64加密
        String encodedString = cn.hutool.core.codec.Base64.encode(originalString);

        // YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXoxMjM0NTY3ODkwQUJDREVGR0hJSktMTU5PUFFSU1RVVldYWVo=
        System.out.println("原始字符串: " + originalString);
        System.out.println("Base64加密后: " + encodedString);

        // 验证解密
        String decodedString = cn.hutool.core.codec.Base64.decodeStr(encodedString);
        System.out.println("解密后字符串: " + decodedString);

    }
}
