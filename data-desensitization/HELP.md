# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

数据脱敏模块属于`ShardingSphere`分布式治理这一核心功能下的子功能模块。
它通过对用户输入的`SQL`进行解析，并依据用户提供的脱敏配置对`SQL`进行改写，从而实现对原文数据进行加密，并将原文数据(**可选**)及密文数据同时存储到底层数据库。
在用户查询数据时，它又从数据库中取出密文数据，并对其解密，最终将解密后的原始数据返回给用户。
`Apache ShardingSphere`分布式数据库中间件自动化&透明化了**数据脱敏过程**，让用户无需关注数据脱敏的实现细节，像使用普通数据那样使用脱敏数据。
此外，无论是已在线业务进行脱敏改造，还是新上线业务使用脱敏功能，`ShardingSphere`都可以提供一套相对完善的解决方案。




脱敏配置主要分为四部分：
- 数据源配置
- 加密器配置
- 脱敏表配置
- 查询属性配置





* [ShardingSphere 官方地址](https://shardingsphere.apache.org/document/legacy/4.x/document/cn/features/orchestration/encrypt/)

