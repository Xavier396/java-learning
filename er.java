class er{
    int x=2;
    if (x<1) {
       x=x+1;
    }
    switch (x) {
        case 3:
            System.out.println("结果正确");
            break;
        default:System.out.println("重新计算");
            break;
    }
}