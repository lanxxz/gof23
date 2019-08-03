package com.alien.gof23.mode2;

/**
 * 主入口<br/>
 * 本包实例用于说明拆解多 if-if else -else 的情况 或者 switch 的情况
 *
 * @author alien
 * @since 2019-08-03 14:48
 */
public class Main {
    public static void main(String[] args) {
        String input = "2";
        CaseChain caseChain = new CaseChain();
        caseChain.addBaseCase(new OneCase()).addBaseCase(new TwoCase())
                .addBaseCase(new DefaultCase());
        caseChain.doSomeThing(input, caseChain);
    }
}
