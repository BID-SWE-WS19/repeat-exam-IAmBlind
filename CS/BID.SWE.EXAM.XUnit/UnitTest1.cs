using System;
using BID.SWE.EXAM.Impl;
using Xunit;

namespace BID.SWE.EXAM.XUnit
{
    public class UnitTest1
    {
        [Fact]
        public void Test1()
        {
            var exercise1 = new Exercise1();

            var method1 = exercise1.Method1();

            Assert.NotNull(method1);
        }
    }
}
