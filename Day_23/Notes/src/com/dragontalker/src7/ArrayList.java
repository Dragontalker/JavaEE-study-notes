package com.dragontalker.src7;

/**
 * 1. 数组存储在 private transient Object[] elementData;
 * 2. 构造器里: this.elementDate = new Object[initialCapacity];
 * 3. 默认值: int initialCapacity = 10;
 * 4. 所以, ArrayList list = new ArrayList(); 创建了长度是10的数组elementData
 * 5. 如果添加导致底层的elementData数组容量不够, 则扩容
 * 6. 默认情况下, 扩容为原来容量的1.5倍, 同时需要将原有数组中的数据复制到新的数组中
 */

public class ArrayList {
}
