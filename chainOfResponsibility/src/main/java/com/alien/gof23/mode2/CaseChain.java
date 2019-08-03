package com.alien.gof23.mode2;

import java.util.ArrayList;
import java.util.List;

/**
 * 责任链管理类， 管理所有的 case
 *
 * @author alien
 * @since 2019-08-03 14:53
 */
public class CaseChain implements BaseCase {
    // 所有 case 列表
    private List<BaseCase> mCaseList = new ArrayList<>();
    // 索引 用于遍历所有 case 列表
    private int index = 0;
    // 添加 case
    public CaseChain addBaseCase(BaseCase baseCase) {
        mCaseList.add(baseCase);
        return  this;
    }


    @Override
    public void doSomeThing(String input, BaseCase baseCase) {
        // 所有遍历完了，直接返回
        if (index == mCaseList.size()) {
            return;
        }
        // 获取当前 case
        BaseCase currentCase = mCaseList.get(index);
        index++;
        // 调用 case 的处理方法
        currentCase.doSomeThing(input, this);
    }
}
