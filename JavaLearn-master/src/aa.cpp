#include <string.h>
#include <stdio.h>
#include <stdint.h>

char text[30];
char temp[10];

/**
  * @brief   组HTTP GET报文
  * @param   pkt   报文缓存指针
  * @param   key   key唯一识别码
  *	@param 	 data  数据
  */
uint32_t HTTP_GETPkt(char *pkt, const char *key, int data)
{
    *pkt = 0;
    memset(temp, 0, 10);
    memset(text, 0, 30);

    // 组装GET请求字符串
    sprintf(temp,"%d", data);
    strcat(text, "auth_key=");
    strcat(text, key);
    strcat(text, "&");
    strcat(text, "data=");
    strcat(text, temp);

    // 向服务器发送GET请求的文件地址
    strcat(pkt, "GET /Train/getinfo.php?");
    strcat(pkt, text);
    // 使用1.1版本HTTP协议
    strcat(pkt, " HTTP/1.1\r\n");
    // 服务器所在地址，这是自己电脑通过无线局域网建立的服务器
    // IP：192.168.1.108，PORT：8888
    strcat(pkt, "Host: 192.168.1.108:8888\r\n");

    // 保持连接
    strcat(pkt, "Connection: Keep-Alive\r\n");
    // 不使用缓存
    strcat(pkt, "Cache-Control: no-cache\r\n");
    strcat(pkt, "\r\n\r\n");

    return strlen(pkt);
}