package com.wj.leetcode.everyday.lcof.Q35;

/**
 * Created by white_wolf on 2020/6/10.
 *
 * @author thebestwj
 */
// 不用hashmap

/**
 * 思路：复制新的节点到源节点之后，进行random节点的处理，然后再分离出来
 */
public class SolutionB {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }
        // 完成链表节点的复制
        Node cur = head;
        while (cur != null) {
            Node copyNode = new Node(cur.val);
            copyNode.next = cur.next;
            cur.next = copyNode;
            cur = cur.next.next;
        }

        // 完成链表复制节点的随机指针复制
        cur = head;
        while (cur != null) {
            if (cur.random != null) { // 注意判断原来的节点有没有random指针
                cur.next.random = cur.random.next;
            }
            cur = cur.next.next;
        }

        // 将链表一分为二
        Node copyHead = head.next;
        cur = head;
        Node curCopy = head.next;
        while (cur != null) {
            cur.next = cur.next.next;
            cur = cur.next;
            if (curCopy.next != null) {
                curCopy.next = curCopy.next.next;
                curCopy = curCopy.next;
            }
        }
        return copyHead;
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
}
