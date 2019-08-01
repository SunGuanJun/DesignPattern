代理模式


优点：
1. 协调调用者和被调用者，降低了系统的耦合度
2. 代理对象作为客户端和目标对象之间的中介，起到了保护目标对象的作用

缺点：
1. 由于在客户端和真实主题之间增加了代理对象，因此会造成请求的处理速度变慢
2. 实现代理模式需要额外的工作（有些代理模式的实现非常复杂），从而增加了系统实现的复杂度


应用场景
1. 当需要为一个对象在不同的地址空间提供局部的代表时。此时的代理模式称为远程代理：为一个对象在不同的地址空间提供局部代表
目的：
- 隐藏一个对象存在于不同地址空间的事实
- 远程机器可能具有更好的计算性能与处理速度，可以快速响应并处理客户端请求

2. 当需要创建开销非常大的对象时，此时的代理模式称为虚拟代理：通过使用一个小的对象代理一个大对象
目的：
- 减少系统的开销

3. 当需要控制对原始对象的访问时。此时的代理模式称为保护代理：控制目标对象的访问，给不同用户提供不同的访问权限
目的：
- 用来控制对真实对象的访问权限

4. 当需要在访问对象时附加额外操作时。此时的代理模式称为智能引用代理，额外操作包括耗时操作、计算访问次数等等
目的：
- 在不影响对象类的情况下，在访问对象时进行更多的操作


5. 防火墙代理：保护目标不让恶意用户靠近

6. Cache代理：为结果提供临时的存储空间，以便其他客户端调用



