

public class Xinglijiance {
    public double xinglijiance(Ren chengke,int piaojia) {
        if(chengke.xingli.size()==0) {
            return -1;
        }
        for(int i=0;i<chengke.xingli.size();i++) {
            if(chengke.xingli.get(i).getZhongliang()<0) {
                return -1;
            }
        }
        for(int i=0;i<chengke.xingli.size();i++) {
            if(chengke.xingli.get(i).getChang()<0) {
                return -1;
            }
        }
        for(int i=0;i<chengke.xingli.size();i++) {
            if(chengke.xingli.get(i).getGao()<0) {
                return -1;
            }
        }
        for(int i=0;i<chengke.xingli.size();i++) {
            if(chengke.xingli.get(i).getKuan()<0) {
                return -1;
            }
        }
        if(piaojia<0) {
            return -1;
        }
        double money=0;
        if(chengke.getShifa()=="中国"&&chengke.getDaoda()=="中国")
        {
            if(chengke.getChengkezhonglei()=="占座婴儿"||chengke.getChengkezhonglei()=="不占座婴儿") {
                int zhongliang;
                for(int i=0;i<chengke.xingli.size();i++) {
                    if(chengke.xingli.get(i).getZhongliang()>10)
                    {
                        money+=(chengke.xingli.get(i).getZhongliang()-10)*piaojia*0.015;
                    }
                    if(i-0>=1) {
                        money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠金卡会员"||chengke.getChengkezhonglei()=="天合联盟超级精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>60)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-60)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>50)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-50)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>40)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-40)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }

            }
            else if(chengke.getChengkezhonglei()=="南航明珠银卡会员"||chengke.getChengkezhonglei()=="天合联盟精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>50)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-50)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>40)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-40)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>30)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-30)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }

            }
            else if(chengke.getChengkezhonglei()=="留学生"||chengke.getChengkezhonglei()=="劳务"||chengke.getChengkezhonglei()=="海员")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>40)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-40)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>30)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-30)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>20)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-20)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }

            }
            else {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>40)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-40)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>30)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-30)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>20)
                        {
                            money+=(chengke.xingli.get(i).getZhongliang()-20)*piaojia*0.015;
                        }
                        if(i-0>=1) {
                            money+=chengke.xingli.get(i).getZhongliang()*0.015*piaojia;
                        }
                    }
                }
            }
        }
        else if(chengke.getShifa()=="日本"||chengke.getShifa()=="美洲"||
                chengke.getShifa()=="澳新"||chengke.getShifa()=="俄罗斯"||
                chengke.getShifa()=="迪拜"||/*chengke.getDaoda()=="日本"||
				chengke.getDaoda()=="美洲"||chengke.getDaoda()=="澳新"||
				chengke.getDaoda()=="俄罗斯"||chengke.getDaoda()=="迪拜"||*/
                (chengke.getShifa()=="新加坡"&&chengke.getDaoda()=="中国"))
        {
            if(chengke.getChengkezhonglei()=="不占座婴儿")
            {
                for(int i=0;i<chengke.xingli.size();i++) {
                    if(chengke.xingli.get(i).getZhongliang()>10||
                            chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
                    {
                        return -1;
                    }
                    if(i>0) {
                        return -1;
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠金卡会员"||chengke.getChengkezhonglei()=="天合联盟超级精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2) {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1) {
                            if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=43&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠银卡会员"||chengke.getChengkezhonglei()=="天合联盟精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2) {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1) {
                            if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=33&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="留学生"||chengke.getChengkezhonglei()=="劳务"||chengke.getChengkezhonglei()=="海员")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-3==1) {
                            money+=1000;
                        }
                        if(i-3>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
            }
            else
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
            }
        }
        else if(chengke.getShifa()=="中西亚"/*||chengke.getDaoda()=="中西亚"*/)
        {
            if(chengke.getChengkezhonglei()=="不占座婴儿")
            {
                for(int i=0;i<chengke.xingli.size();i++) {
                    if(chengke.xingli.get(i).getZhongliang()>10||
                            chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
                    {
                        return -1;
                    }
                    if(i>0) {
                        return -1;
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠金卡会员"||chengke.getChengkezhonglei()=="天合联盟超级精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=0)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-0==1) {
                            money+=450;
                        }
                        if(i-0>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠银卡会员"||chengke.getChengkezhonglei()=="天合联盟精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=0)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-0==1) {
                            money+=450;
                        }
                        if(i-0>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="留学生"||chengke.getChengkezhonglei()=="劳务"||chengke.getChengkezhonglei()=="海员")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-3==1) {
                            money+=450;
                        }
                        if(i-3>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-0==1) {
                            money+=450;
                        }
                        if(i-0>1) {
                            money+=1300;
                        }
                    }
                }
            }
        }
        else if(chengke.getShifa()=="内罗毕"/*||chengke.getDaoda()=="内罗毕"*/)
        {
            if(chengke.getChengkezhonglei()=="不占座婴儿")
            {
                for(int i=0;i<chengke.xingli.size();i++) {
                    if(chengke.xingli.get(i).getZhongliang()>10||
                            chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
                    {
                        return -1;
                    }
                    if(i>=1) {
                        return -1;
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠金卡会员"||chengke.getChengkezhonglei()=="天合联盟超级精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=2000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=43&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=2000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠银卡会员"||chengke.getChengkezhonglei()=="天合联盟精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=2000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=33&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=2000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="留学生"||chengke.getChengkezhonglei()=="劳务"||chengke.getChengkezhonglei()=="海员")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-3==1) {
                            money+=1000;
                        }
                        if(i-3>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>=1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=2000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
            }
            else {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=1000;
                        }
                        if(i-2>1) {
                            money+=2000;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=2000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==1) {
                            money+=1000;
                        }
                        if(i-1>1) {
                            money+=2000;
                        }
                    }
                }
            }
        }
        else if(chengke.getShifa()=="韩国"&&chengke.getDaoda()=="中国")
        {
            if(chengke.getChengkezhonglei()=="不占座婴儿")
            {
                for(int i=0;i<chengke.xingli.size();i++) {
                    if(chengke.xingli.get(i).getZhongliang()>10||
                            chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
                    {
                        return -1;
                    }
                    if(i>=1) {
                        return -1;
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠金卡会员"||chengke.getChengkezhonglei()=="天合联盟超级精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=0)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=43&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-0==1) {
                            money+=450;
                        }
                        if(i-0>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠银卡会员"||chengke.getChengkezhonglei()=="天合联盟精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=0)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=33&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-0==1) {
                            money+=450;
                        }
                        if(i-0>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="留学生"||chengke.getChengkezhonglei()=="劳务"||chengke.getChengkezhonglei()=="海员")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-3==1) {
                            money+=450;
                        }
                        if(i-3>=1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-0==1) {
                            money+=450;
                        }
                        if(i-0>1) {
                            money+=1300;
                        }
                    }
                }
            }
        }
        else
        {
            if(chengke.getChengkezhonglei()=="不占座婴儿") {
                for(int i=0;i<chengke.xingli.size();i++) {
                    if(chengke.xingli.get(i).getZhongliang()>10||
                            chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>115)
                    {
                        return -1;
                    }
                    if(i>=1) {
                        return -1;
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠金卡会员"||chengke.getChengkezhonglei()=="天合联盟超级精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=43&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return 100000000;
                            }
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>43&&chengke.xingli.get(i).getZhongliang()<=52&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>52&&chengke.xingli.get(i).getZhongliang()<=65&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=43&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>65||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="南航明珠银卡会员"||chengke.getChengkezhonglei()=="天合联盟精英")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=2)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=33&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(i<=1)
                        {
                            if(chengke.xingli.get(i).getZhongliang()>33&&chengke.xingli.get(i).getZhongliang()<=42&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>42&&chengke.xingli.get(i).getZhongliang()<=55&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=33&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>55||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        else
                        {
                            if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                            {
                                money+=3000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                    &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                            {
                                money+=1000;
                            }
                            else if(chengke.xingli.get(i).getZhongliang()>45||
                                    chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                            {
                                return -1;
                            }
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else if(chengke.getChengkezhonglei()=="留学生"||chengke.getChengkezhonglei()=="劳务"||chengke.getChengkezhonglei()=="海员")
            {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-3==1) {
                            money+=450;
                        }
                        if(i-3>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-3==1) {
                            money+=450;
                        }
                        if(i-3>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱"||chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
            }
            else {
                if(chengke.getJicang()=="头等舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="公务舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-2==1) {
                            money+=450;
                        }
                        if(i-2>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="明珠经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==1) {
                            money+=450;
                        }
                        if(i-1>1) {
                            money+=1300;
                        }
                    }
                }
                else if(chengke.getJicang()=="经济舱")
                {
                    for(int i=0;i<chengke.xingli.size();i++) {
                        if(chengke.xingli.get(i).getZhongliang()>23&&chengke.xingli.get(i).getZhongliang()<=32&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>32&&chengke.xingli.get(i).getZhongliang()<=45&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=158)
                        {
                            money+=3000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()<=23&&
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>158
                                &&chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()<=300)
                        {
                            money+=1000;
                        }
                        else if(chengke.xingli.get(i).getZhongliang()>45||
                                chengke.xingli.get(i).getChang()+chengke.xingli.get(i).getGao()+chengke.xingli.get(i).getKuan()>300)
                        {
                            return -1;
                        }
                        if(i-1==0) {
                            money+=450;
                        }
                        if(i-1>0) {
                            money+=1300;
                        }
                    }
                }
            }
        }
        return money;
    }
}
